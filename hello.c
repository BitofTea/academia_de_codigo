#include <stdio.h>

void welcome(char * name){
  printf("Hello %s, Welcome to Terceira\n", name);
}

int main(int argc, char* argv[]){

  char * cadet = "cadet";

  if(argv[1]){
    cadet = argv[1];
  }

  welcome(cadet);
}
