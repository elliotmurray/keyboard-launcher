package uk.co.elliotmurray.keyboardlauncher.ext;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\u0007\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\u0007\u00a2\u0006\u0004\b\t\u0010\u0007\u001an\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\f*\b\u0012\u0004\u0012\u0002H\r0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000b26\u0010\u0010\u001a2\u0012\u0013\u0012\u0011H\r\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u0011H\u000e\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u0002H\f0\u0011\u001a<\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00170\u000b\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\r0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000b\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00190\u000b\u001aQ\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00040\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u000b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H\f0\u001b\u001aG\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00020\u000b2#\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001c\u0012\u0006\u0012\u0004\u0018\u0001H\f0\u001b\u001a\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b0\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000b\u001a(\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\r0\u000b\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000b\u001a<\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000e0\u00170\u000b\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\r0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000b\u00a8\u0006!"}, d2 = {"add", "", "T", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "", "item", "addToList", "(Lio/reactivex/rxjava3/subjects/BehaviorSubject;Ljava/lang/Object;)V", "", "addToSet", "combineLatest", "Lio/reactivex/rxjava3/core/Observable;", "O", "T1", "T2", "other", "func", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t1", "t2", "combineLatestPair", "Lkotlin/Pair;", "filterNull", "Luk/co/elliotmurray/keyboardlauncher/ext/Nullable;", "mapList", "Lkotlin/Function1;", "t", "mapNotNull", "scanToSet", "takeWhen", "withLatestFromPair", "app_debug"})
public final class RxExtKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, O extends java.lang.Object>io.reactivex.rxjava3.core.Observable<O> mapNotNull(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T> $this$mapNotNull, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends O> func) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.rxjava3.core.Observable<T> filterNull(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<uk.co.elliotmurray.keyboardlauncher.ext.Nullable<T>> $this$filterNull) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.rxjava3.core.Observable<java.util.Set<T>> scanToSet(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T> $this$scanToSet) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void addToSet(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.subjects.BehaviorSubject<java.util.Set<T>> $this$add, T item) {
    }
    
    public static final <T extends java.lang.Object>void addToList(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.subjects.BehaviorSubject<java.util.List<T>> $this$add, T item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, O extends java.lang.Object>io.reactivex.rxjava3.core.Observable<java.util.List<O>> mapList(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<java.util.List<T>> $this$mapList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends O> func) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object, O extends java.lang.Object>io.reactivex.rxjava3.core.Observable<O> combineLatest(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T1> $this$combineLatest, @org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T2> other, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends O> func) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object>io.reactivex.rxjava3.core.Observable<kotlin.Pair<T1, T2>> combineLatestPair(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T1> $this$combineLatestPair, @org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T2> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object>io.reactivex.rxjava3.core.Observable<kotlin.Pair<T1, T2>> withLatestFromPair(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T1> $this$withLatestFromPair, @org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T2> other) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T1 extends java.lang.Object>io.reactivex.rxjava3.core.Observable<T1> takeWhen(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<T1> $this$takeWhen, @org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.core.Observable<?> other) {
        return null;
    }
}