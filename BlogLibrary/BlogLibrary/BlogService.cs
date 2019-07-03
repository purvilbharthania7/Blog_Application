using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace BlogLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    public class BlogService : IBlogService
    {
        public List<Blog> ShowBlogs()
        {
            SqlDataAdapter da = new SqlDataAdapter("SELECT Id,author_name,title,data FROM blogs",
                @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=blogdb;Integrated Security=True;
                Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;
                MultiSubnetFailover=False");

            DataSet ds = new DataSet();
            da.Fill(ds, "blogs");
            var dataList = new List<Blog>();
            foreach (DataRow row in ds.Tables[0].Rows)
            {
                var Blog = new Blog();
                Blog.Id = (int)row["Id"];
                Blog.Author = row["author_name"].ToString();
                Blog.Title = row["title"].ToString();
                Blog.Data = row["data"].ToString();
                dataList.Add(Blog);
            }
            return dataList;
        }

        public Blog ShowBlog(int id)
        {
            SqlConnection cnn = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=blogdb;Integrated Security=True;
                                                    Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;
                                                    MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cnn;
            cmd.CommandText = "SELECT * FROM blogs WHERE Id = @id";
            SqlParameter p1 = new SqlParameter("@id", id);
            //SqlParameter p2 = new SqlParameter("@userid", userid);
            cmd.Parameters.Add(p1);
            //cmd.Parameters.Add(p2);
            cnn.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            Blog bg = new Blog();
            while (reader.Read())
            {
                bg.Id = reader.GetInt32(0);
                bg.Author = reader.GetString(1);
                bg.Title = reader.GetString(2);
                bg.Data = reader.GetString(3);
            }
            reader.Close();
            cnn.Close();
            return bg;
        }

        public void AddBlog(string author_name, string title, string data)
        {
            SqlConnection cnn = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=blogdb;Integrated Security=True;
                                                    Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;
                                                    MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cnn;
            //string datetime = DateTime.Now.ToString();
            cmd.CommandText = "INSERT into blogs(author_name,title,data) values(@author_name,@title,@data)";
            SqlParameter p2 = new SqlParameter("@author_name", author_name);
            SqlParameter p3 = new SqlParameter("@title", title);
            SqlParameter p4 = new SqlParameter("@data", data);
            cmd.Parameters.Add(p2);
            cmd.Parameters.Add(p3);
            cmd.Parameters.Add(p4);
            cnn.Open();
            cmd.ExecuteNonQuery();
        }

        public bool UpdateBlog(int id, string author_name, string title, string data)
        {
            SqlConnection cnn = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=blogdb;Integrated Security=True;
                                                    Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;
                                                    MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cnn;
            cmd.CommandText = "SELECT * FROM blogs where Id=@id";
            SqlParameter p1 = new SqlParameter("@id", id);
            //SqlParameter p2 = new SqlParameter("@userid", userid);
            cmd.Parameters.Add(p1);
            //cmd.Parameters.Add(p2);
            cnn.Open();
            var count = cmd.ExecuteScalar();
            if (count != null)
            {
                //string datetime = DateTime.Now.ToString();
                cmd.CommandText = "UPDATE blogs set author_name=@author_name,title=@title,data=@data where Id=@id1";
                SqlParameter p3 = new SqlParameter("@id1", id);
                SqlParameter p4 = new SqlParameter("@author_name", author_name);
                SqlParameter p5 = new SqlParameter("@title", title);
                SqlParameter p6 = new SqlParameter("@data", data);
                cmd.Parameters.Add(p3);
                cmd.Parameters.Add(p4);
                cmd.Parameters.Add(p5);
                cmd.Parameters.Add(p6);
                //cmd.Parameters.Add(p7);
                //cmd.Parameters.Add(p8);
                cmd.ExecuteNonQuery();
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool DeleteBlog(int id)
        {
            SqlConnection cnn = new SqlConnection(@"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=blogdb;Integrated Security=True;
                                                    Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;
                                                    MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cnn;
            cmd.CommandText = "SELECT * FROM blogs where Id=@id";
            //cmd.CommandText = "DELETE FROM notes where noteid=@id";
            SqlParameter p1 = new SqlParameter("@id", id);
            //SqlParameter p2 = new SqlParameter("@userid", userid);
            cmd.Parameters.Add(p1);
            //cmd.Parameters.Add(p2);
            cnn.Open();
            var count = cmd.ExecuteScalar();
            if (count != null)
            {
                cmd.CommandText = "DELETE FROM blogs where Id=@id1";
                SqlParameter p3 = new SqlParameter("@id1", id);
                //SqlParameter p4 = new SqlParameter("@userid1", userid);
                cmd.Parameters.Add(p3);
                //cmd.Parameters.Add(p4);
                cmd.ExecuteNonQuery();
                return true;
            }
            else
            {
                return false;
            }
        }

    }
}
