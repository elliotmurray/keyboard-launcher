// Generated by data binding compiler. Do not edit!
package uk.co.elliotmurray.keyboardlauncher.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import uk.co.elliotmurray.keyboardlauncher.R;

public abstract class ItemLauncherBinding extends ViewDataBinding {
  @NonNull
  public final TextView tvAppName;

  @Bindable
  protected String mAppName;

  protected ItemLauncherBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView tvAppName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvAppName = tvAppName;
  }

  public abstract void setAppName(@Nullable String appName);

  @Nullable
  public String getAppName() {
    return mAppName;
  }

  @NonNull
  public static ItemLauncherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_launcher, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemLauncherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemLauncherBinding>inflateInternal(inflater, R.layout.item_launcher, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLauncherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_launcher, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemLauncherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemLauncherBinding>inflateInternal(inflater, R.layout.item_launcher, null, false, component);
  }

  public static ItemLauncherBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemLauncherBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemLauncherBinding)bind(component, view, R.layout.item_launcher);
  }
}
