SUMMARY = "Build extra packages for the package repository"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PACKAGES = "packagegroup-gumstix"

RDEPENDS_packagegroup-gumstix = " \
    ${ROS_INSTALL} \
    apache2 \
    boost \
    caspa-streaming \
    cheese \
    cronie \
    devmem2 \
    dtc \
    ethtool \
    fb-test \
    git \
    gstreamer1.0-meta-audio \
    gstreamer1.0-meta-base \
    gstreamer1.0-meta-debug \
    gstreamer1.0-meta-video \
    gstreamer1.0-meta-x11-base \
    i2c-tools \
    iperf \
    kernel-devsrc \
    librxtx-java \
    lowpan-tools \
    mavlink-socket \
    nano \
    ofono \
    omap3-writeprom \
    opencv \
    openjdk-8 \
    openocd \
    openssh \
    packagegroup-core-eclipse-debug \
    packagegroup-core-sdk \
    packagegroup-core-standalone-sdk-target \
    packagegroup-core-tools-debug \
    packagegroup-core-tools-profile \
    packagegroup-core-tools-testapps \
    php \
    php-cgi \
    php-cli \
    picodlp-control \
    python \
    python-pip \
    python-pyserial \
    python3 \
    python3-pip \
    python3-pyserial \
    robovero-examples \
    robovero-python \
    rtklib \
    screen \
    spidev-test \
    sshd \
    ttn-pkt-fwd \
    uart-loop-test \
    vlc \
"

RDEPENDS_packagegroup-gumstix_remove_dragonboard-410c += " \
    openjdk-8 \
"

RDEPENDS_packagegroup-gumstix_append_overo = " \
    omap3-isp-live \
"

RDEPENDS_packagegroup-gumstix_remove_rpi = " \
    packagegroup-core-tools-testapps \
"

ROS_INSTALL = " \
    packagegroup-ros-world \
    python-distutils \
    python-wstool \
"
