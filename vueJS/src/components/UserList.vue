<template>
    <div id="UserList">
        <v-toolbar dense>
            <v-toolbar-side-icon></v-toolbar-side-icon>
            <v-toolbar-title>Chats</v-toolbar-title>
        </v-toolbar>
        <v-text-field
            style=" margin-left:10px;
                    margin-right:10px"
            label="Search"
            v-model="input.searchString"
            append-icon="search">
        </v-text-field>
        <v-sheet
        min-height="600px"
        max-height="600px"
        style="overflow-y:scroll">
            <v-list v-if="!loadChannels">
                <v-list-tile
                v-for="channel in channels
                    .filter(channel => channel.name.toLowerCase().includes(
                        input.searchString.toLowerCase()))"
                :key="channel.id"
                avatar
                @click="changeChanel(channel.id)">
                    <v-list-tile-avatar>
                        <img :src="users.find(user => user.id ===
                            channel.userIds.find(id => id !== userId)).avatar">
                    </v-list-tile-avatar>

                    <v-list-tile-content>
                        <v-list-tile-title v-html="channel.name"></v-list-tile-title>
                    </v-list-tile-content>

                    <v-list-tile-action>
                        <v-icon :color="channel.unreadMessages ? 'teal' : 'grey'">chat_bubble</v-icon>
                    </v-list-tile-action>
                </v-list-tile>
            </v-list>
                <div v-else-if="loadChannels & channels.length == 0">
                    Empty
                </div>
            <v-progress-circular
                v-else
                indeterminate
                color="primary">
            </v-progress-circular>
        </v-sheet>

    </div>
</template>

<script>
export default {
    data () {
        return {
            input:{
                message:"",
                searchString:""
            }
        }
    },
    methods: {
        changeChanel(channelId){
            this.$store.commit('selectChanel',channelId);
        }
    },
    computed:{
        currentChannelId(){
            return this.$store.state.currentChannelId;
        },
        channels(){
            return this.$store.state.channels;
        },
        users(){
            return this.$store.state.users;
        },
        userId(){
            return this.$store.state.userId;
        },
        loadChannels(){
            return this.$store.state.loadChannels;
        }
    }

}
</script>
