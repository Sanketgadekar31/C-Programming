/*
    Type declaration Instructions:
    - Declare variable before using it.  <-- Compiler read line by line statement
        VALID --->  int a,b,c;
                    a = b = c = 2;
        INVALID ->  int a = b = c = 2:

    Arithmetic Instructions:
    - eg. int sum = a + b
    - 4 % 2 --> 0
    - #include<math.h>
      int power =  pow(b,c)  ---> b^c
    - int op int --> int
    - int op float --> float
    - float op float --> float

    Operator Precedence:
    - bracket  -->  *,/,%  --> +,-  -->  =
    - for same precedence --> calculate Left to Right   (Associativity Rule)

    Control Instruction:
    1. Sequence Instruction - line by line
    2. Loop Instruction - for/while
    3. Decision Instruction - If/Else
    4. Case Instruction - switch
*/

#include<stdio.h>
int main()
{
    int a = 1.9999;
    printf("%d", a);
    return 0;
}

//op: 1