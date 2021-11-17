package com.demo.tictactoe.databinding;
import com.demo.tictactoe.R;
import com.demo.tictactoe.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.demo.tictactoe.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.gridlayout.widget.GridLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.cell00.setTag(null);
        this.cell01.setTag(null);
        this.cell02.setTag(null);
        this.cell10.setTag(null);
        this.cell11.setTag(null);
        this.cell12.setTag(null);
        this.cell20.setTag(null);
        this.cell21.setTag(null);
        this.cell22.setTag(null);
        this.mboundView0 = (androidx.gridlayout.widget.GridLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 8);
        mCallback6 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 2);
        mCallback9 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 9);
        mCallback7 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.demo.tictactoe.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.gameViewModel == variableId) {
            setGameViewModel((com.demo.tictactoe.viewmodel.GameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViewModel(@Nullable com.demo.tictactoe.viewmodel.GameViewModel GameViewModel) {
        this.mGameViewModel = GameViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.gameViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeGameViewModelCells((androidx.databinding.ObservableArrayMap<java.lang.String,java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeGameViewModelCells(androidx.databinding.ObservableArrayMap<java.lang.String,java.lang.String> GameViewModelCells, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String gameViewModelCells22 = null;
        java.lang.String gameViewModelCells00 = null;
        java.lang.String gameViewModelCells10 = null;
        java.lang.String gameViewModelCells02 = null;
        com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
        java.lang.String gameViewModelCells01 = null;
        java.lang.String gameViewModelCells20 = null;
        java.lang.String gameViewModelCells11 = null;
        java.lang.String gameViewModelCells21 = null;
        androidx.databinding.ObservableArrayMap<java.lang.String,java.lang.String> gameViewModelCells = null;
        java.lang.String gameViewModelCells12 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (gameViewModel != null) {
                    // read gameViewModel.cells
                    gameViewModelCells = gameViewModel.getCells();
                }
                updateRegistration(0, gameViewModelCells);


                if (gameViewModelCells != null) {
                    // read gameViewModel.cells["22"]
                    gameViewModelCells22 = gameViewModelCells.get("22");
                    // read gameViewModel.cells["00"]
                    gameViewModelCells00 = gameViewModelCells.get("00");
                    // read gameViewModel.cells["10"]
                    gameViewModelCells10 = gameViewModelCells.get("10");
                    // read gameViewModel.cells["02"]
                    gameViewModelCells02 = gameViewModelCells.get("02");
                    // read gameViewModel.cells["01"]
                    gameViewModelCells01 = gameViewModelCells.get("01");
                    // read gameViewModel.cells["20"]
                    gameViewModelCells20 = gameViewModelCells.get("20");
                    // read gameViewModel.cells["11"]
                    gameViewModelCells11 = gameViewModelCells.get("11");
                    // read gameViewModel.cells["21"]
                    gameViewModelCells21 = gameViewModelCells.get("21");
                    // read gameViewModel.cells["12"]
                    gameViewModelCells12 = gameViewModelCells.get("12");
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cell00.setOnClickListener(mCallback1);
            this.cell01.setOnClickListener(mCallback2);
            this.cell02.setOnClickListener(mCallback3);
            this.cell10.setOnClickListener(mCallback4);
            this.cell11.setOnClickListener(mCallback5);
            this.cell12.setOnClickListener(mCallback6);
            this.cell20.setOnClickListener(mCallback7);
            this.cell21.setOnClickListener(mCallback8);
            this.cell22.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell00, gameViewModelCells00);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell01, gameViewModelCells01);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell02, gameViewModelCells02);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell10, gameViewModelCells10);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell11, gameViewModelCells11);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell12, gameViewModelCells12);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell20, gameViewModelCells20);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell21, gameViewModelCells21);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.cell22, gameViewModelCells22);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(2, 1);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(1, 2);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(1, 0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(0, 1);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(2, 2);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(2, 0);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(1, 1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(0, 2);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // gameViewModel
                com.demo.tictactoe.viewmodel.GameViewModel gameViewModel = mGameViewModel;
                // gameViewModel != null
                boolean gameViewModelJavaLangObjectNull = false;



                gameViewModelJavaLangObjectNull = (gameViewModel) != (null);
                if (gameViewModelJavaLangObjectNull) {




                    gameViewModel.onClickedCellAt(0, 0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): gameViewModel.cells
        flag 1 (0x2L): gameViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}