package videoListComponent

import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.RComponent
import react.dom.p
import react.setState

class VideoList: RComponent<VideoListProps, VideoListState>() {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        setState {
                            selectedVideo = video
                        }
                    }
                }
                if (video == state.selectedVideo) {
                    +"▶ "
                }
                + "${video.speaker}: ${video.title}"
            }
        }
    }
}

