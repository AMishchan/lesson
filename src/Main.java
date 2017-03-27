
public class Main {

    public static void main(String[] args) {
        int maxAge = 14;
        int minAge = 8;
        int ForthFirstDiff = 0;
        int SecondFirstdiff = 0;
        int SecondThirdDiff = 0;
        int ForthThirdDiff = 0;
        for (int i = minAge; i < maxAge; i++)
        {

            for (int j = minAge; j < maxAge; j++)
            {


                for (int k = minAge; k < maxAge; k++)
                {

                    for (int l = minAge; l < maxAge; l++)
                    {
                        if ((i + j + k == 30) && (j + k + l == 32)){
                                ForthFirstDiff = (j + k + l) - (i + j + k);

                            //Четвертый брат старше первого на ForthFirstDiff лет
                        }

                        if ((j + k + l == 32) && (i + k + l == 32)){
                             SecondFirstdiff  = (j + k + l) - (i + k + l) ;
                            //Возрасты первого и второго братьев одинаковы
                        }
                        if ((i + k + l == 32) && (l + j + i == 35)){
                            SecondThirdDiff = (l + j + i) - (i + k + l);
                            //Второй брат старше третьего на SecondThirdDiff лет

                        }

                        if ((l + j + i == 35) && (i + j + k == 30)){
                             ForthThirdDiff = (l + j + i) - (i + j + k);
                            //Четвертый брат старше третьего на ForthThirdDiff лет
                        }

                    }
                }
            }
        }

        int FirstAge = (35 - ForthFirstDiff) / 3 ;

        int ThirdAge = (35 - FirstAge) / 3;
        int ForthAge = ThirdAge + ForthThirdDiff;

        System.out.println("Четвертый брат старше первого на " + ForthFirstDiff +" лет");
        System.out.println("Первый брат старше второго на " + SecondFirstdiff);
        System.out.println("Второй старше третьего на " + SecondThirdDiff);
        System.out.println("Четвертый брат старше третьего на " + ForthThirdDiff + " лет");
       System.out.println("Возраст Первого брата: " + FirstAge + " лет. Возраст Второго брата равен возрасту Первого. Возраст третьего: " + ThirdAge + " лет. Возраст четвертого: " + ForthAge + " лет." );
    }

}

