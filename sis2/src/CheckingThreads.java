class CheckingThread extends Thread {
        private final int assistantId;
        public CheckingThread(int assistantId) {
            this.assistantId = assistantId;
        }

        @Override
        public void run() {

            for (int i = 1; i <= ExamChecking.ITERATIONS; i++) {
                try {
                    System.out.println("Assistant " + assistantId + " is checking sheet " + ((assistantId - 1) * ExamChecking.SHEETS_PER_ASSISTANT + i) + " (Iteration " + i + ")");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Thread " + assistantId + " was interrupted.");
                }
            }
            System.out.println("Assistant " + assistantId + " has finished checking all assigned sheets.");
        }
    }

