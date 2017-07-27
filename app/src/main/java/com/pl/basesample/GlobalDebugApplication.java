package com.pl.basesample;

import com.facebook.stetho.Stetho;

/**
 * Created by PL on 2017/7/27.
 */

public class GlobalDebugApplication extends GlobalApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(Stetho.newInitializerBuilder(this)
        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
        .build());
    }
}
