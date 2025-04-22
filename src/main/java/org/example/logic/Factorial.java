package org.example.logic;
import java.util.Optional;

//팩토리얼 구하기
public class Factorial {
    private final int n;
    private Integer result;

    public Factorial(int n){
        this.n=n;
        execute();
    }

    //fact 계산로직
    private Integer fact(int x){
        if(x<0) return -1; //0보다 작으면 구할 수 없으므로 null
        else if(x==0) return 1;
        else return x*fact(x-1);
    }

    private void execute(){
        Integer result = fact(this.n);
        if(result<0) this.result = null;
        else this.result = result;
    }

    //null 사용 가능
    public Optional<Integer> getResult(){
        return Optional.ofNullable(result);
    }
}
