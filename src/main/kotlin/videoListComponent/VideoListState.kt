package videoListComponent

import model.Video
import react.RBuilder
import react.RState
import react.ReactElement

external interface VideoListState: RState {
    var selectedVideo: Video?
}

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}