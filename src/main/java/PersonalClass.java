public class PersonalClass {
    protected float income; //доходы
    protected float expenses; //расходы

    public float addIncome(float aIncome) {

        if (aIncome >= 0) {
            income= income + aIncome;
        } else {
           System.out.println("Доход не может быть отрицательным");
        }
        return income;
    }

    public float addExpenses(float aExpenses){

        if (aExpenses >= 0) {
            expenses= expenses + aExpenses;
        } else {
            System.out.println("Расход не может быть отрицательным");
        }
        return expenses;
    }

    public float taxUsnIncome() {
        float taxUsn = 6;
        float usn = 0;
        if (income > 0) {
            usn = (income * taxUsn) / 100;
        } else {
            System.out.println("Нет дохода для расчета налога");
        }
        return usn;
    }

    public float taxNdflIncome() {
        float taxNdfl = 15;
        float ndfl = 0;
        if (income > expenses)  {
            ndfl = ((income - expenses) * taxNdfl) / 100;
        } else {
            System.out.println("Нет дохода для расчета налога");
        }
        return ndfl;
    }


}
