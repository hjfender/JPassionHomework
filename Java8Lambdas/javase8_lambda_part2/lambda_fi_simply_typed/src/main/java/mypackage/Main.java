package mypackage;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoublePredicate;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;

public class Main {

	public static void main(String[] args) {
		
		IntPredicate intPredicate = x -> x > 10;
		boolean resultBoolean = intPredicate.test(5);
		System.out.println(resultBoolean);
		
		LongPredicate longPredicate = x -> x > 10;
		resultBoolean = longPredicate.test(20L);
		System.out.println(resultBoolean);
		
		LongUnaryOperator longUnaryOperator = x -> x * 10;
		long resultLong = longUnaryOperator.applyAsLong(20L);
		System.out.println(resultLong);
		
		DoubleBinaryOperator doubleBinaryOperator = (x, y) -> x*y;
		double resultDouble = doubleBinaryOperator.applyAsDouble(2.0, 3.0);
		System.out.println(resultDouble);
		
		// <For your own exercise>
		// -Create DoublePredicate functional interface object
		// -Test it with appropriate test value
		DoublePredicate doublePredicate = x -> x != 0.0;
		boolean doublePredResult = doublePredicate.test(0.0);
		System.out.println("Double Predicate: " + doublePredResult);
		
		
		// <For your own exercise>
		// -Create IntBinaryOperator functional interface object
		// -Test it with appropriate test value
		IntBinaryOperator intBinaryOperator = (x, y) -> x*y;
		int intBinaryOperatorResult = intBinaryOperator.applyAsInt(2, 3);
		System.out.println("Int Binary Operator: " + intBinaryOperatorResult);
	}

}
