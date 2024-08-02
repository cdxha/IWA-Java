package com.fasterxml.jackson.datatype.jdk8;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.util.VersionUtil;

/**
 * Automatically generated from PackageVersion.java.in during
 * packageVersion-generate execution of maven-replacer-plugin in
 * pom.xml.
 */
public final class PackageVersion implements Versioned {
    public final static Version VERSION = VersionUtil.parseVersion(
        "2.13.0", "com.fasterxml.jackson.datatype", "jackson-datatype-jdk8");

    @Override
    public Version version() {
        return VERSION;
    }
}
