#
# This is the GPIO-DEMO apllication recipe
#
#

SUMMARY = "Rogue Application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "file://${PROJECT_FOLDER}\
"
S = "${WORKDIR}/"
CFLAGS_prepend = "-I ${S}/include"
inherit cmake
