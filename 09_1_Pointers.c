/*
    Pointers:
    - variable that store memory address of another variable
    - Declaration: int *ptr = &var    (* --> value of address, & --> adress)
*/

#include<stdio.h>
int main()
{
    float price=100.0;
    float *ptr=&price;   //<-- normal pointer storing variable address in pointer
    float **pptr=&ptr;   //<-- pointer storing pointer address in another pointer
    return 0;
}