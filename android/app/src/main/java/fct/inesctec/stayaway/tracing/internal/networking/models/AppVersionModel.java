/*
 * Copyright (c) 2020 INESC TEC <https://www.inesctec.pt>
 *
 * This Source Code Form is subject to the terms of the European Union
 * Public License, v. 1.2. If a copy of the EUPL was not distributed with
 * this file, You can obtain one at https://opensource.org/licenses/EUPL-1.2.
 *
 * SPDX-License-Identifier: EUPL-1.2
 */

package fct.inesctec.stayaway.tracing.internal.networking.models;

public class AppVersionModel {
    private VersionModel ios;
    private VersionModel android;

    public AppVersionModel(VersionModel ios, VersionModel android) {
        this.ios = ios;
        this.android = android;
    }

    public VersionModel getIOSVersion() {
        return ios;
    }

    public VersionModel getAndroidVersion() {
        return android;
    }
}
