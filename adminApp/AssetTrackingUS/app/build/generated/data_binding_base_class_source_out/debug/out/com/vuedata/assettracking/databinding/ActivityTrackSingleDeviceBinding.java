// Generated by data binding compiler. Do not edit!
package com.vuedata.assettracking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mapbox.mapboxsdk.maps.MapView;
import com.vuedata.assettracking.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTrackSingleDeviceBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout descriptionLayout;

  @NonNull
  public final TextView descriptionView;

  @NonNull
  public final ConstraintLayout mainLayout;

  @NonNull
  public final LinearLayout mapLayout;

  @NonNull
  public final MapView mapView;

  @NonNull
  public final TextView titleView;

  protected ActivityTrackSingleDeviceBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout descriptionLayout, TextView descriptionView,
      ConstraintLayout mainLayout, LinearLayout mapLayout, MapView mapView, TextView titleView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.descriptionLayout = descriptionLayout;
    this.descriptionView = descriptionView;
    this.mainLayout = mainLayout;
    this.mapLayout = mapLayout;
    this.mapView = mapView;
    this.titleView = titleView;
  }

  @NonNull
  public static ActivityTrackSingleDeviceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_track_single_device, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTrackSingleDeviceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTrackSingleDeviceBinding>inflateInternal(inflater, R.layout.activity_track_single_device, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTrackSingleDeviceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_track_single_device, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTrackSingleDeviceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTrackSingleDeviceBinding>inflateInternal(inflater, R.layout.activity_track_single_device, null, false, component);
  }

  public static ActivityTrackSingleDeviceBinding bind(@NonNull View view) {
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
  public static ActivityTrackSingleDeviceBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityTrackSingleDeviceBinding)bind(component, view, R.layout.activity_track_single_device);
  }
}
