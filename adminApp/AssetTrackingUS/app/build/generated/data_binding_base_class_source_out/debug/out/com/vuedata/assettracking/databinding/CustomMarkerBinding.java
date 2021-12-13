// Generated by view binder compiler. Do not edit!
package com.vuedata.assettracking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vuedata.assettracking.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomMarkerBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView markerWindowSnippet;

  @NonNull
  public final TextView markerWindowTitle;

  private CustomMarkerBinding(@NonNull CardView rootView, @NonNull TextView markerWindowSnippet,
      @NonNull TextView markerWindowTitle) {
    this.rootView = rootView;
    this.markerWindowSnippet = markerWindowSnippet;
    this.markerWindowTitle = markerWindowTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomMarkerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomMarkerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_marker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomMarkerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.marker_window_snippet;
      TextView markerWindowSnippet = ViewBindings.findChildViewById(rootView, id);
      if (markerWindowSnippet == null) {
        break missingId;
      }

      id = R.id.marker_window_title;
      TextView markerWindowTitle = ViewBindings.findChildViewById(rootView, id);
      if (markerWindowTitle == null) {
        break missingId;
      }

      return new CustomMarkerBinding((CardView) rootView, markerWindowSnippet, markerWindowTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}