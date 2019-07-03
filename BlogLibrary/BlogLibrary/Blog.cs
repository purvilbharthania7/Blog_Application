using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace BlogLibrary
{
    [DataContract]
    public class Blog
    {
        private int id;
        private string author;
        private string title;
        private string data;

        [DataMember]
        public int Id
        {
            get { return id; }
            set { id = value; }
        }
        [DataMember]
        public string Author
        {
            get { return author; }
            set { author = value; }
        }
        [DataMember]
        public string Title
        {
            get { return title; }
            set { title = value; }
        }
        [DataMember]
        public string Data
        {
            get { return data; }
            set { data = value; }
        }
    }
}
