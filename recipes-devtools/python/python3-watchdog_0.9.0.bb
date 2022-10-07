DEPS = "python3-pathtools3"
DEPENDS = "${DEPS}"
RDEPENDS:${PN} = "${DEPS}"
inherit pypi setuptools3

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "965f658d0732de3188211932aeb0bb457587f04f63ab4c1e33eab878e9de961d"

BBCLASSEXTEND = "nativesdk native"
