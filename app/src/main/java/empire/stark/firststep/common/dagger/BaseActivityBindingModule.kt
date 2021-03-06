package empire.stark.firststep.common.dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector
import empire.stark.firststep.common.dagger.scope.PerActivity
import empire.stark.firststep.main.dagger.MainActivityModule
import empire.stark.firststep.main.view.MainActivity

/**
 * Created by YEN_MINH on 10/11/2017.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */
@Module
abstract class BaseActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class, BaseActivityModule::class))
    abstract fun mainActivity(): MainActivity

}