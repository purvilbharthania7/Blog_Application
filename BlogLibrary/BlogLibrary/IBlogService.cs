using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace BlogLibrary
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IService1" in both code and config file together.
    [ServiceContract]
    public interface IBlogService
    {
        [OperationContract]
        List<Blog> ShowBlogs();

        [OperationContract]
        Blog ShowBlog(int id);

        [OperationContract]
        void AddBlog(string author_name, string title, string data);

        [OperationContract]
        bool UpdateBlog(int id, string author_name, string title, string data);

        [OperationContract]
        bool DeleteBlog(int id);
        

        // TODO: Add your service operations here
    }

    // Use a data contract as illustrated in the sample below to add composite types to service operations.
    // You can add XSD files into the project. After building the project, you can directly use the data types defined there, with the namespace "BlogLibrary.ContractType".
    
}
