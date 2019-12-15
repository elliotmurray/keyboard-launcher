package uk.co.elliotmurray.keyboardlauncher;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.String;

public interface LauncherBindingModelBuilder {
  LauncherBindingModelBuilder onBind(
      OnModelBoundListener<LauncherBindingModel_, DataBindingEpoxyModel.DataBindingHolder> listener);

  LauncherBindingModelBuilder onUnbind(
      OnModelUnboundListener<LauncherBindingModel_, DataBindingEpoxyModel.DataBindingHolder> listener);

  LauncherBindingModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<LauncherBindingModel_, DataBindingEpoxyModel.DataBindingHolder> listener);

  LauncherBindingModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<LauncherBindingModel_, DataBindingEpoxyModel.DataBindingHolder> listener);

  LauncherBindingModelBuilder appName(String appName);

  LauncherBindingModelBuilder id(long id);

  LauncherBindingModelBuilder id(@Nullable Number... ids);

  LauncherBindingModelBuilder id(long id1, long id2);

  LauncherBindingModelBuilder id(@Nullable CharSequence key);

  LauncherBindingModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  LauncherBindingModelBuilder id(@Nullable CharSequence key, long id);

  LauncherBindingModelBuilder layout(@LayoutRes int layoutRes);

  LauncherBindingModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
