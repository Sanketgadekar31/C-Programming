/*
    C is case sensitive
/*  
    Varibale = store the data
    1. Varibles are cae sensitive
    2. 1st character is '_' or alphabet only
    3. No comma or blank place allowed
    4. Varibale values are changable
    5. Variable name should be meaningful
*/
/*
    Data Types:
    int = 2 bit
    float = 4 bit
    char = 
*/
/*
    Constants:
    1. Interger constants = 1,2,3,0,-1,-2
    2. Real constants = 1.0,2.0,3.14
    3. Character Constants = 'a', 'b'
*/
/*
    Keywords: Reserved words
    32 keywords in total
*/
/*
    Comments: 
    //  <-- single line
        <-- Multiple Line
*/

#include<stdio.h>    /* <---- Preprocessor directives   */
int main()
{
    int a,b;
    scanf("%d", &a);
    scanf("%d", &b);
    int sum = a+b;
    printf("%d", sum);
    return 0;
}

/*
    Compiler: Program that translates C code into machine code
    .c file --> C compiler  --> a.exe (Windows) or a.out (linus or mac)    
*/