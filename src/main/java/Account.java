class Account {
    double a, b, c;

    Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant() {
        return b * b - (4 * a * c);
    }

    double getRoot1() {
        return (-b + Math.pow(getDiscriminant(),0.5)) / 2 * a;
    }

    double getRoot2() {
        return (-b - Math.pow(getDiscriminant(),0.5)) / 2 * a;
    }

    double getRoot() {
        return -b / 2 * a;
    }

    String solveQE() {
        double delta = getDiscriminant();
        if (delta == 0) {
            return "Quadratic has double root: " + getRoot();
        } else if (delta > 0) {
            return "Quadratic Equation has 2 roots! Root 1: " + getRoot1() + " and Root 2: " + getRoot2();
        } else {
            return "Quadratic Equation has no roots";
        }
    }
}
