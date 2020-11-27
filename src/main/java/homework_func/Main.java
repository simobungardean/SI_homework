package homework_func;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        SalesRepresentative[] reps = new SalesRepresentative[] {
                new SalesRepresentative(10, 500),
                new SalesRepresentative(7, 800),
                new SalesRepresentative(8, 600),
                new SalesRepresentative(4, 1500),
                new SalesRepresentative(9, 300)
        };

        System.out.println("Unsorted:");
        print(reps);

        System.out.println();

        System.out.println("Sorted:");
        SalesRepresentative[] sortedReps = sort(reps);	// as the problem demands
        print(sortedReps);
    }

    //	print SalesRepresentative[]
    public void print(SalesRepresentative[] reps) {
        for(int i = 0; i < reps.length; i++) {
            System.out.printf(
                    "Sales guy %d has %d sales with a quota of %d$. He has achieved %d$ worth of sales.",
                    i+1, reps[i].getSales(), reps[i].getQuota(), reps[i].getWorth()
            );
            System.out.println();
        }
    }

    //	implement bubbleSort, return new array sorted
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {
        SalesRepresentative[] sortedReps = new SalesRepresentative[reps.length];
        for(int i = 0; i < reps.length; i++) {
            sortedReps[i] =
                    new SalesRepresentative(reps[i].getSales(), reps[i].getQuota());
        }

        boolean sorted;
        int n = sortedReps.length;
        do {
            sorted = true;
            for(int i = 0; i < n - 1; i++)
                if(sortedReps[i].getWorth() < sortedReps[i+1].getWorth()) {
                    SalesRepresentative aux = sortedReps[i];
                    sortedReps[i] = sortedReps[i+1];
                    sortedReps[i+1] = aux;
                    sorted = false;
                }
        } while (!sorted);

        return sortedReps;
    }
}

