/* THIS FILE IS CURRENTLY BEING MIGRATED AND SHOULD NOT BE MODIFIED!!
 *
 * if you really need to modify it, please also modify it's twin located at
 *  ../utils/
 *
*/

// library for easier interaction with docker containers
package lib

// Make sure the docker group from outside the container is added inside of the contaienr
def get_docker_group_id() {
    def DOCKER_GROUP_ID = sh(script: "getent group docker | cut -d: -f3", returnStdout: true).toString().trim()
    return DOCKER_GROUP_ID
}

return this
