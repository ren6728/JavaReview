package main.Practices;

public class ForEachLoop {
    public static int maximum(int[] numbers){
int maxSoFar=numbers[0];
for(int num: numbers){
if(num>maxSoFar){
    maxSoFar=num;
}
}
return maxSoFar;
    }
    public static void main(String[] args) {
        int[] marks={125,132,90,76,45};
        int highest_marks=maximum(marks);
        System.out.println("Highest marks: "+highest_marks);
    }
}
