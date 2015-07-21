#include <iostream>
#include <string>
#include <stdlib.h> 

using namespace std;

int main()
{
   string username;
   string password;

   cout << "Enter Your Username: " ;
   getline (cin, username, '\n');

   cout << "Enter Your Password: ";
   getline (cin, password, '\n');

   if   ((username == "jc" && password == "123") || (username == "bsellers2" && password == "123")
         || (username == "bsellers3" && password == "123"))
    {

    cout << "Access Granted" << endl;
    system ("./bin/TicTacToe.exe");
    }

   else
   {
       cout << "Invalid Credentials, Access Denied! " << endl;
       cout << "Please Try Again" << '\n';

       cout << "Enter Your Username: " ;
   getline (cin, username, '\n');

   cout << "Enter Your Password: ";
   getline (cin, password, '\n');

    if ((username == "jc" && password == "123") || (username == "bsellers2" && password == "123")
         || (username == "bsellers3" && password == "123"))

    {
        cout << "Access Granted" << endl;
    }
   }




   return 0;
}
