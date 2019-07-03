using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BlogClient
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            label1.Text = "Select a blog from the list...";
            ServiceReference1.BlogServiceClient proxy = new ServiceReference1.BlogServiceClient();
            //DataSet ds = proxy.ShowBlogs();
            //listBox1.DataSource = ds.Tables[0].DefaultView;
            //listBox1.DisplayMember = "title";
            //listBox1.ValueMember = "Id";
            //proxy.Close();
            BlogClient.ServiceReference1.Blog[] blogs = proxy.ShowBlogs();
            listBox1.DataSource = blogs;
            listBox1.DisplayMember = "title";
            listBox1.ValueMember = "Id";
            //label5.Text = label6.Text = label7.Text = label13.Text = label18.Text = "";
            //textBox1.Text = textBox2.Text = textBox3.Text = textBox4.Text = textBox5.Text = "";
            //label12.Text = ""+ds.Tables[0].Rows.Count;
            proxy.Close();
        }

        private void listBox1_Click(object sender, EventArgs e)
        {
            ServiceReference1.BlogServiceClient proxy = new ServiceReference1.BlogServiceClient();
            BlogClient.ServiceReference1.Blog blog = proxy.ShowBlog(int.Parse(listBox1.SelectedValue.ToString()));
            //label5.Text = label6.Text = label7.Text = label13.Text = label18.Text = label16.Text = "";

                label2.Text = blog.Title;
                label3.Text = blog.Data;
                label4.Text = blog.Author;
                //label13.Text = note.DateAndTime.ToString();
                //label18.Text = note.NotePassword;
                //textBox1.Text = textBox2.Text = textBox3.Text = textBox4.Text = textBox5.Text = "";
                //label16.Text = "going in if condition...";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.BlogServiceClient proxy = new ServiceReference1.BlogServiceClient();

            if (String.IsNullOrEmpty(textBox1.Text))
            {
                if (String.IsNullOrEmpty(textBox2.Text))
                {
                    proxy.Close();
                    label8.Text = "Please write title of the blog....";
                }
                else if (String.IsNullOrEmpty(textBox3.Text))
                {
                    proxy.Close();
                    label8.Text = "Please write content of the blog....";
                }
                else if (String.IsNullOrEmpty(textBox4.Text))
                {
                    proxy.Close();
                    label8.Text = "Please write the author's name....";
                }
                else
                {
                    proxy.AddBlog(textBox4.Text, textBox2.Text, textBox3.Text);
                    label8.Text = "Recored inserted successfully";
                    BlogClient.ServiceReference1.Blog[] blogs = proxy.ShowBlogs();
                    //int totaldata=ds.Tables[0].Rows.Count;
                    //label11.Text += totaldata;
                    listBox1.DataSource = blogs;
                    //pass Object into Datasource :: Last solution in mind
                    //listBox1.DataSource = ds.Tables[0].Rows[totaldata-1][0];
                    listBox1.DisplayMember = "title";
                    listBox1.ValueMember = "Id";
                    //label5.Text = textBox1.Text;
                    //label6.Text = textBox2.Text;
                    //label7.Text = textBox3.Text;
                    //label5.Text = label6.Text = label7.Text = label13.Text = label18.Text = "";
                    textBox1.Text = textBox2.Text = textBox3.Text = textBox4.Text = "";
                    //textBox1.Text = ds.Tables[0].Rows[totaldata - 1][0].ToString();
                    proxy.Close();
                }
            }
            else
            {
                proxy.Close();
                label8.Text = "Alert!!!!! Please Remove the data from Id otherwise recored will not be inserted.....";
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ServiceReference1.BlogServiceClient proxy = new ServiceReference1.BlogServiceClient();
            if (String.IsNullOrEmpty(textBox2.Text) || String.IsNullOrEmpty(textBox3.Text) || String.IsNullOrEmpty(textBox4.Text))
            {
                label8.Text = "Please write full details";
                proxy.Close();
            }
            else
            {
                bool IsUserExist = proxy.UpdateBlog(int.Parse(textBox1.Text), textBox4.Text, textBox2.Text, textBox3.Text);
                if (IsUserExist)
                {
                    label8.Text = "Recored updated successfully";
                    BlogClient.ServiceReference1.Blog[] blogs = proxy.ShowBlogs();
                    listBox1.DataSource = blogs;
                    listBox1.DisplayMember = "title";
                    listBox1.ValueMember = "Id";
                    /*label5.Text = textBox1.Text;
                    label6.Text = textBox2.Text;
                    label7.Text = textBox3.Text;
                    label18.Text = textBox4.Text;*/
                    //label5.Text = label6.Text = label7.Text = label13.Text = label18.Text = "";
                    textBox1.Text = textBox2.Text = textBox3.Text = textBox4.Text = "";
                    proxy.Close();
                }
                else
                {
                    label8.Text = "This Id field is not Exist.....";
                    proxy.Close();
                }
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            ServiceReference1.BlogServiceClient proxy = new ServiceReference1.BlogServiceClient();
            if (String.IsNullOrEmpty(textBox1.Text))
            {
                label8.Text = "Please write Id....";
                proxy.Close();
            }
            else
            {
                bool IsUserExist = proxy.DeleteBlog(int.Parse(textBox1.Text));
                if (IsUserExist)
                {
                    label8.Text = "Recored deleted successfully";
                    BlogClient.ServiceReference1.Blog[] blogs = proxy.ShowBlogs();
                    listBox1.DataSource = blogs;
                    listBox1.DisplayMember = "title";
                    listBox1.ValueMember = "Id";
                    //label5.Text = label6.Text = label7.Text = label13.Text = label18.Text = "";
                    textBox1.Text = textBox2.Text = textBox3.Text = textBox4.Text = "";
                    proxy.Close();
                }
                else
                {
                    label8.Text = "This Id field is not Exist.....";
                    proxy.Close();
                }

            }

        }

        private void button4_Click(object sender, EventArgs e)
        {
            ServiceReference1.BlogServiceClient proxy = new ServiceReference1.BlogServiceClient();
            if (String.IsNullOrEmpty(textBox1.Text))
            {
                proxy.Close();
                label8.Text = "Please enter the id...";
                textBox1.Text = textBox2.Text = textBox3.Text = textBox4.Text = "";
            }
            else
            {
                BlogClient.ServiceReference1.Blog blog = proxy.ShowBlog(int.Parse(textBox1.Text.ToString()));
                if(String.IsNullOrEmpty(blog.Author))
                {
                    proxy.Close();
                    label8.Text = "Please enter valid id...";
                    textBox1.Text = textBox2.Text = textBox3.Text = textBox4.Text = "";
                }
                else
                {
                    textBox2.Text = blog.Title;
                    textBox3.Text = blog.Data;
                    textBox4.Text = blog.Author;
                    proxy.Close();
                }
            }
        }
    }
}

