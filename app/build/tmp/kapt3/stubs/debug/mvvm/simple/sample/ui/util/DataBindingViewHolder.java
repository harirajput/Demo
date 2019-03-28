package mvvm.simple.sample.ui.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\r\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lmvvm/simple/sample/ui/util/DataBindingViewHolder;", "T", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "layoutId", "", "parent", "Landroid/view/ViewGroup;", "attachToParent", "", "(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)V", "dataBinding", "Landroid/databinding/ViewDataBinding;", "(Landroid/databinding/ViewDataBinding;)V", "getDataBinding", "()Landroid/databinding/ViewDataBinding;", "onBind", "", "t", "Lmvvm/simple/sample/data/model/ListModel;", "app_debug"})
public abstract class DataBindingViewHolder<T extends java.lang.Object> extends android.support.v7.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ViewDataBinding dataBinding = null;
    
    public abstract void onBind(@org.jetbrains.annotations.NotNull()
    mvvm.simple.sample.data.model.ListModel t);
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ViewDataBinding getDataBinding() {
        return null;
    }
    
    public DataBindingViewHolder(@org.jetbrains.annotations.NotNull()
    android.databinding.ViewDataBinding dataBinding) {
        super(null);
    }
    
    public DataBindingViewHolder(@org.jetbrains.annotations.NotNull()
    @android.support.annotation.NonNull()
    android.view.LayoutInflater inflater, @android.support.annotation.IdRes()
    int layoutId, @org.jetbrains.annotations.NotNull()
    @android.support.annotation.NonNull()
    android.view.ViewGroup parent, @android.support.annotation.NonNull()
    boolean attachToParent) {
        super(null);
    }
}