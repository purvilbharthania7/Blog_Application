using BlogLibrary;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace BlogServiceHostConsole
{
    class Program
    {
        static void Main(string[] args)
        {
            Type t = typeof(BlogService);
            Uri tcp = new Uri("net.tcp://localhost:8010/BlogService");
            Uri http = new Uri("http://localhost:8000/BlogService");
            ServiceHost host = new ServiceHost(t, tcp, http);
            host.Open();
            Console.WriteLine("Published");
            Console.ReadLine();
            host.Close();
            
        }
    }
}
