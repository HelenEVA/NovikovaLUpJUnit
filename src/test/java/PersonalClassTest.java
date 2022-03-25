import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class PersonalClassTest {

    @ParameterizedTest
    @CsvFileSource (resources = {"getIncome.csv"})

    public void getIncome(float income, float aIncome, float expected){

        PersonalClass r = new PersonalClass();

        r.income = income;

        float actual = r.addIncome(aIncome);

        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvFileSource (resources = {"getExpenses.csv"})

    public void getExpenses(float expenses, float aExpenses, float expected){

        PersonalClass r = new PersonalClass();

        r.expenses = expenses;

        float actual = r.addExpenses(aExpenses);

        Assertions.assertEquals(expected,actual);


    }

    @ParameterizedTest
    @CsvFileSource (resources = {"getTaxUsnIncome.csv"})

    public void getTaxUsnIncome (float income, float expected){

        PersonalClass r = new PersonalClass();
        r.income = income;

        float actual = r.taxUsnIncome();
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource (resources = {"getTaxNdflIncome.csv"})

    public void getTaxNdflIncome (float income, float expenses, float expected){

        PersonalClass r = new PersonalClass();
        r.income = income;
        r.expenses = expenses;

        float actual = r.taxNdflIncome();
        Assertions.assertEquals(expected, actual);

    }

}
