package sample.com.glp.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sample.com.glp.data.model.ListModel;

public abstract class FoodItemRowBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout header;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView time;

  @Bindable
  protected ListModel mItem;

  protected FoodItemRowBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout header, TextView name, TextView time) {
    super(_bindingComponent, _root, _localFieldCount);
    this.header = header;
    this.name = name;
    this.time = time;
  }

  public abstract void setItem(@Nullable ListModel item);

  @Nullable
  public ListModel getItem() {
    return mItem;
  }

  @NonNull
  public static FoodItemRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FoodItemRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FoodItemRowBinding>inflate(inflater, sample.com.glp.R.layout.food_item_row, root, attachToRoot, component);
  }

  @NonNull
  public static FoodItemRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FoodItemRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FoodItemRowBinding>inflate(inflater, sample.com.glp.R.layout.food_item_row, null, false, component);
  }

  public static FoodItemRowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FoodItemRowBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FoodItemRowBinding)bind(component, view, sample.com.glp.R.layout.food_item_row);
  }
}
