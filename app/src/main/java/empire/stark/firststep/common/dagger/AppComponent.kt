package empire.stark.firststep.common.dagger

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import empire.stark.firststep.App
import javax.inject.Singleton

/**
 * Created by YEN_MINH on 3/8/2017.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, AndroidSupportInjectionModule::class, BaseActivityBindingModule::class))
interface AppComponent : AndroidInjector<DaggerApplication> {
    fun inject(app: App)

    override fun inject(instance: DaggerApplication?)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

}
