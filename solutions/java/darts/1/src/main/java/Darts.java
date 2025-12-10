class Darts {
    // Formula for circle: x^2 + y^2 = r^2
    int score(double xOfDart, double yOfDart) {
        if (xOfDart*xOfDart + yOfDart*yOfDart <= 10*10){
            if (xOfDart*xOfDart + yOfDart*yOfDart > 5*5){
                return 1;
            } else {
                if (xOfDart*xOfDart + yOfDart*yOfDart <= 5*5){
                    if (xOfDart*xOfDart + yOfDart*yOfDart > 1*1){
                        return 5;
                    } else {
                        return 10;
                    }
                } else {
                    return 0;
                }
            }
        } else {
            return 0;
        }
    }
}
