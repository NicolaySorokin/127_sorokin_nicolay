public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int NumberStart = 0, NumberEnd = 0;
        while (NumberStart <= num){
            if(NumberStart*NumberStart <= num)
                NumberEnd = NumberStart*NumberStart;
            else
                break;
            NumberStart++;
        }
        return NumberEnd;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int interNumber = 1, lastMeaning = 1, interMeaning = 0;
        if(num == 0)
            return 1;
        else {
            while (interNumber <= num){
                interMeaning = 2*lastMeaning + 6;
                interNumber++;
                lastMeaning = interMeaning;
            }
            return interMeaning;
        }
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int degree = base;
        while(degree < num)
            degree *= base;
        return degree == num;
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int count = 0;
        while(start > end){
            if(start%2 != 0 || start-end <= 2){
                start -= 1;
            } else {
                start /= 2;
            }
            count++;
        }
        return count;
    }
}
