#include <stdio.h>
#include <string>
#include <iostream>
#include <sys/types.h>
#include <string.h>
#include <dirent.h>
#include <unistd.h>
#include <sys/stat.h>
std::string des;

void publishtest(const char * path, const char *name)
{
    printf("path = %s\nfilename = %s\n", path, name);
    FILE * file = fopen(path,"w");
    fprintf(file, "// This is auto publish test file\n");
    fprintf(file, "package com.Control;\n");
    fprintf(file, "import java.util.*;\n");
    fprintf(file, "import org.testng.*\n");
    fprintf(file, "import src.java.com.Control.*\n");
    fprintf(file, "public class %s {\n",name);
    fprintf(file, "\n");
    fprintf(file, "\tpublic %s() {\n",name);
    fprintf(file, "\t}\n");
    fprintf(file, "\t@BeforeClass\n");
    fprintf(file, "\tpublic static void setUpClass() throws Exception {}\n");
    fprintf(file, "\t@AfterClass\n");
    fprintf(file, "\tpublic static void tearDownClass() throws Exception {}\n");
    fprintf(file, "\t@BeforeMethod\n");
    fprintf(file, "\tpublic void setUpMethod() throws Exception {}\n");
    fprintf(file, "\t@AfterMethod\n");
    fprintf(file, "\tpublic void tearDownMethod() throws Exception {}\n");
    fprintf(file, "\t//GetInfo Test\n");
    fprintf(file, "\t@Test\n");
    fprintf(file, "\t\tpublic void GetInfo() {\n");
    fprintf(file, "\t\tSystem.out.println(\"GetInfo\");\n");
    fprintf(file, "\t\tString expResult = \"tian\";\n");
    fprintf(file, "\t\tString result = GetInfo();\n");
    fprintf(file, "\t\tassertEquals(result, expResult);\n");
    fprintf(file, "\t}\n");
    fprintf(file, "}\n");
    fclose(file);
}
void listDir(const char * path)
{
    puts(path);
    DIR *pDir;
    struct dirent *ent;
    int i = 0;
    char childpath[512];
    pDir = opendir(path);
    memset(childpath,0,sizeof childpath);

    while((ent = readdir(pDir)) != NULL)
    {
        if(ent -> d_type & DT_DIR)
        {
            continue;
            // enter dir
            /*
            if(strcmp(ent->d_name,".") == 0 || strcmp(ent -> d_name, "..") == 0)
                continue;
            sprintf(childpath, "%s/%s",path,ent->d_name);
            printf("path:%s\n", childpath);
            listDir(childpath);
            */
        }
        else
        {
            std::cout << ent->d_name << std::endl;
            std::string str = des + "AutoTest" + ent -> d_name;
            std::string name = ("AutoTest");
            name += ent -> d_name;
            publishtest(str.c_str(), name.c_str());
        }
    }
}
int main(int argc, char * argv[])
{
    //printf("argc = %d\n", argc);
    if(argc != 2)
        return argc;
    std::string workspace = argv[1];
    if(workspace[workspace.size() - 1] != '/')
        workspace += "/";
    std::string src = workspace + "src/java/com/Control/";
    des = workspace + "test/com/Control/";
    std::cout << workspace << std::endl;
    std::cout << src << std::endl;
    std::cout << des << std::endl;
    listDir(src.c_str());
    return 0;
}
