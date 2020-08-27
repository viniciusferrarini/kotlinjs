package videoListComponent

import model.Video
import react.RProps

external interface VideoListProps: RProps {
    var videos: List<Video>
}