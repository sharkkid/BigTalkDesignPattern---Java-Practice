package c01.simpleFactory;

/**
 * 乘法計算
 * @author Yan
 *
 */
public class CalulatorMul extends Calculator {
	@Override
	public int getResult() {
		return numberA*numberB;
	}
}
