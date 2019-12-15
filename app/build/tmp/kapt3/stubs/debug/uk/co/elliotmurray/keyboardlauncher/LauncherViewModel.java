package uk.co.elliotmurray.keyboardlauncher;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import uk.co.elliotmurray.keyboardlauncher.base.BaseViewModel;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tH\u0016R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Luk/co/elliotmurray/keyboardlauncher/LauncherViewModel;", "Luk/co/elliotmurray/keyboardlauncher/base/BaseViewModel;", "Luk/co/elliotmurray/keyboardlauncher/ILauncherInputs;", "Luk/co/elliotmurray/keyboardlauncher/ILauncherOutputs;", "repo", "Luk/co/elliotmurray/keyboardlauncher/IRepository;", "(Luk/co/elliotmurray/keyboardlauncher/IRepository;)V", "bsSearchTerm", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "inputs", "getInputs", "()Luk/co/elliotmurray/keyboardlauncher/ILauncherInputs;", "outputs", "getOutputs", "()Luk/co/elliotmurray/keyboardlauncher/ILauncherOutputs;", "getRepo", "()Luk/co/elliotmurray/keyboardlauncher/IRepository;", "items", "Lio/reactivex/rxjava3/core/Observable;", "", "Luk/co/elliotmurray/keyboardlauncher/LauncherItem;", "searchTermUpdated", "", "search", "app_debug"})
public final class LauncherViewModel extends uk.co.elliotmurray.keyboardlauncher.base.BaseViewModel implements uk.co.elliotmurray.keyboardlauncher.ILauncherInputs, uk.co.elliotmurray.keyboardlauncher.ILauncherOutputs {
    @org.jetbrains.annotations.NotNull()
    private final uk.co.elliotmurray.keyboardlauncher.ILauncherInputs inputs = null;
    @org.jetbrains.annotations.NotNull()
    private final uk.co.elliotmurray.keyboardlauncher.ILauncherOutputs outputs = null;
    private final io.reactivex.rxjava3.subjects.BehaviorSubject<java.lang.String> bsSearchTerm = null;
    @org.jetbrains.annotations.NotNull()
    private final uk.co.elliotmurray.keyboardlauncher.IRepository repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final uk.co.elliotmurray.keyboardlauncher.ILauncherInputs getInputs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final uk.co.elliotmurray.keyboardlauncher.ILauncherOutputs getOutputs() {
        return null;
    }
    
    @java.lang.Override()
    public void searchTermUpdated(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.rxjava3.core.Observable<java.util.List<uk.co.elliotmurray.keyboardlauncher.LauncherItem>> items() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final uk.co.elliotmurray.keyboardlauncher.IRepository getRepo() {
        return null;
    }
    
    public LauncherViewModel(@org.jetbrains.annotations.NotNull()
    uk.co.elliotmurray.keyboardlauncher.IRepository repo) {
        super();
    }
}