package day41javadeveloper.Q105;

public class module {

/*
module ServiceAPI{
    exports com.example.api;
        }

module ServiceProvider{
requires ServiceAPI;
provides com.example.api with com.myimpl.Impl;
}

module Consumer{
    requires serviceAPI;
    uses com.example.api;
    }


 */
}
/*
Which two statements are correct? (Choose two.)
A. The ServiceProvider module is the only module that, at run time, can provide the
com.example.api API.
B. The placement of the com.example.api API in a separate module, ServiceAPI, makes it easy to
install multiple provider modules.
C. The Consumer module should require the ServiceProvider module.
D. The ServiceProvider module should export the com.myimpl package.
E. The ServiceProvider module does not know the identity of a module (such as Consumer) that uses
the
com.example.api API.
Answer: AC

 */