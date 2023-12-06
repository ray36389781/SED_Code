public class CompilerSubsystem extends Subsystem {
    private Parser parser = new Parser();
    private Scanner scanner = new Scanner();
    private ProgramNode programNode = new ProgramNode();
    private BytecodeStream bytecodeStream = new BytecodeStream();
    public void process() {
        this.parser.process();
        this.scanner.process();
        this.programNode.process();
        this.bytecodeStream.process();
    }
}
