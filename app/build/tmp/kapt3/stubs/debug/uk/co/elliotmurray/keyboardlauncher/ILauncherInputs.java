package uk.co.elliotmurray.keyboardlauncher;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import uk.co.elliotmurray.keyboardlauncher.base.BaseViewModel;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Luk/co/elliotmurray/keyboardlauncher/ILauncherInputs;", "", "searchTermUpdated", "", "search", "", "app_debug"})
public abstract interface ILauncherInputs {
    
    public abstract void searchTermUpdated(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
}