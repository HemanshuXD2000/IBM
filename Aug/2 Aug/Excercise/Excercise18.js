"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Excercise17_1 = require("./Excercise17");
var Playlist = /** @class */ (function () {
    function Playlist(playlistId) {
        this.playlistId = playlistId;
        this.songs = [];
    }
    Playlist.prototype.addSong = function (song) {
        if (this.songs.length >= Playlist.maxSongs) {
            throw new Error('Too Many Songs in your Playlist.');
        }
        else {
            this.songs.push(song);
        }
    };
    Playlist.maxSongs = 10;
    return Playlist;
}());
var songPlaylist = new Playlist('Playlist01');
var namePlaylist = songPlaylist.playlistId;
songPlaylist.addSong(new Excercise17_1.Songs('Hey Jude(Single)', 'Hey Jude', 'POP'));
var maxSongs = Playlist.maxSongs;
