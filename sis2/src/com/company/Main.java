class ExamChecking {
    private static final int TOTAL_SHEETS = 500;
    private static final int SHEETS_PER_ASSISTANT = 50;
    private static final int ITERATIONS = 6;

    public static void main(String[] args) {
        int numberOfAssistants = TOTAL_SHEETS / SHEETS_PER_ASSISTANT;

        for (int i = 0; i < numberOfAssistants; i++) {
            Thread assistantThread = new CheckingThread(i + 1);
            assistantThread.start();  // Запускаем поток
        }
    }
}



