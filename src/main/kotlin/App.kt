import model.Video
import react.*
import react.dom.h3
import styled.styledDiv
import videoListComponent.videoList

class App: RComponent<RProps, RState>() {

    private val unwatchedVideos = listOf(
        Video(1, "Building and breaking things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
        Video(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
        Video(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
    )

    private val watchedVideos = listOf(
        Video(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
    )

    override fun RBuilder.render() {

        styledDiv {
            h3 {
                +"Videos to watch"
            }
            videoList {
                videos = unwatchedVideos
            }
            h3 {
                +"Videos watched"
            }
            videoList {
                videos = watchedVideos
            }
        }
    }
}
