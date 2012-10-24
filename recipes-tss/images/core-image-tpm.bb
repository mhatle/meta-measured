DESCRIPTION = "Image with Trousers daemon." 

IMAGE_FEATURES += "ssh-server-openssh"

LICENSE = "MIT"

IMAGE_INSTALL = "\
	${CORE_IMAGE_BASE_INSTALL} \
	packagegroup-core-basic \
	trousers \
"   

inherit core-image
