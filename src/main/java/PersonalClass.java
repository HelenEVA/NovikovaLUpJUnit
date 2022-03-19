public class PersonalClass {
    private float income; //доходы
    private float expenses; //расходы

    public void  addIncome(float aIncome) throws Exception {
        if (aIncome <= 0) {
            income= income + aIncome;
        } else {
            throw new Exception("Доход не может быть отрицательным");
        }
    }

    public void addExpenses(float aExpenses) throws Exception {
        if (aExpenses < 0) {
            expenses= expenses + aExpenses;
        } else {
            throw new Exception("Расход не может быть отрицательным");
        }
    }

    public float taxUsnIncome() throws Exception {
        float taxUsn = 6;
        float Usn;
        if (income > 0) {
            Usn = (income * taxUsn) / 100;
            return Usn;
        } else {
            throw new Exception("Нет дохода для расчета налога");
        }
    }

    public float taxNdflIncome() throws Exception {
        float taxNdfl = 15;
        float Ndfl;
        if (income > 0) {
            Ndfl = ((income - expenses) * taxNdfl) / 100;
            return Ndfl;
        } else {
            throw new Exception("Нет дохода для расчета налога");
        }
    }


}
