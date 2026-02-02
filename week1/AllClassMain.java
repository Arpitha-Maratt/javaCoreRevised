package week1;

import model.Student;

public class AllClassMain {
    public static void main(String[] args) {

        Student student = new Student(101);
        System.out.println( student.getId());

        Hello hello = new Hello();
        hello.hello();

        CheckAdult checkAdult = new CheckAdult();
        checkAdult.adultOrNo();

        Relational relational = new Relational();
        relational.valiOrNot();

        PassOrFail passOrFail =  new PassOrFail();
        passOrFail.result();

        GreaterOrSmaller greaterOrSmaller = new GreaterOrSmaller();
        greaterOrSmaller.greaterOrSmaller();

        ForLoop forLoop= new ForLoop();
        forLoop.useFor();

        WhileLoop whileLoop= new WhileLoop();
        whileLoop.whileLoop();

        DoWhile doWhile = new DoWhile();
        doWhile.useDoWhile();

        EnhancedForLoop enhancedForLoop =  new EnhancedForLoop();
        enhancedForLoop.enhancedForLoop();

        UseBreak breaks = new UseBreak();
        breaks.useBreaks();

        LabledBreak labledBreak = new LabledBreak();
        labledBreak.labeledBreak();

        UseStatic useStatic = new UseStatic();
        useStatic.useStatic();

        TypeCasting typeCasting = new TypeCasting();
        typeCasting.implicit();
        typeCasting.explicit();

        Addition addition =  new Addition();
        addition.add();

        EvenOrOdd evenOrOdd =  new EvenOrOdd();
        evenOrOdd.evenOrOdd();

        LargestOfTwo largestOfTwo = new LargestOfTwo();
        largestOfTwo.largest();

        SumOfN sumOfN = new SumOfN();
        sumOfN.sum();

        Reverse reverse = new Reverse();
        reverse.reverseNum();

        ArraySum arraySum = new ArraySum();
        arraySum.arraySum();

    }

}