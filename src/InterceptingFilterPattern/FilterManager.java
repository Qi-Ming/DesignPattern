package InterceptingFilterPattern;

public class FilterManager {
    private FilterChain filterChain;
    private Target target;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        this.target = target;
    }

    public void addFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        filterChain.execute(request);
        target.execute(request);
    }


}
