char Stack[100001]; 
int top = 0;
void push(char ch){
    Stack[top] = ch;
    top++;
}
char peek(){
    return Stack[top-1];
}
bool isValid(char * str){
    top = 0;
    int len = strlen(str);
    for(int i = 0; i < len; i++){
        printf("%c ", str[i]);
        if(str[i] == '(' || str[i] == '{' || str[i] == '['){
            push(str[i]);
        }
        else{            
            if(top == 0)return false;
            else{
                char ch = peek();
                if((ch == '{' && str[i] =='}') || (ch == '[' && str[i] ==']') ||(ch == '(' && str[i] == ')'))top--;
                else return false;
            }
        }
    }
    return top == 0;
}
